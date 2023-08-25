package dev.tonholo.resume.locale

import kotlin.js.Json
import kotlin.js.json

interface JsonExport {
    fun toJson(): Json
}

interface Locale : JsonExport {
    val screens: Screen

    override fun toJson(): Json = json(
        "screens" to screens.toJson(),
    )
}

interface Screen : JsonExport {
    val home: HomePage
    override fun toJson(): Json = json(
        "home" to home.toJson(),
    )
}

sealed interface Page
data class HomePage(
    val info: InfoSection,
    val skills: SkillSection,
    val historySection: HistorySection,
) : Page, JsonExport {

    override fun toJson(): Json = json(
        "info" to info.toJson(),
        "skills" to skills.toJson(),
        "historySection" to historySection.toJson(),
    )

    data class InfoSection(
        val jobTitle: String,
        val about: MultilineParagraph,
    ) : JsonExport {
        override fun toJson(): Json = json(
            "jobTitle" to jobTitle,
            "about" to about.value,
        )
    }

    data class SkillSection(
        val languages: Languages,
        val programingLanguages: ProgrammingLanguages
    ) : JsonExport {
        override fun toJson(): Json = json(
            "languages" to languages.toJson(),
            "programingLanguages" to programingLanguages.toJson(),
        )

        data class Languages(
            val title: String,
            val en: String,
            val pt: String,
        ) : JsonExport {
            override fun toJson(): Json = json(
                "title" to title,
                "en" to en,
                "pt" to pt,
            )
        }

        data class ProgrammingLanguages(
            val title: String,
            val ctaShowMore: String,
            val ctaShowLess: String,
        ) : JsonExport {
            override fun toJson(): Json = json(
                "title" to title,
                "ctaShowMore" to ctaShowMore,
                "ctaShowLess" to ctaShowLess,
            )
        }
    }

    data class HistorySection(
        val work: WorkHistory,
        val educational: EducationalHistory,
    ) : JsonExport {

        override fun toJson(): Json = json(
            "work" to work.toJson(),
            "educational" to educational.toJson(),
        )

        interface History {
            val title: String
            val experiences: List<Experience>
        }

        data class WorkHistory(
            override val title: String,
            val technologiesUsed: String,
            override val experiences: List<Experience>,
        ) : History, JsonExport {
            override fun toJson(): Json = json(
                "title" to title,
                "technologiesUsed" to technologiesUsed,
                "experiences" to experiences.map { it.toJson() },
            )
        }

        data class EducationalHistory(
            override val title: String,
            override val experiences: List<Experience>,
        ) : History, JsonExport {
            override fun toJson(): Json = json(
                "title" to title,
                "experiences" to experiences.map { it.toJson() },
            )
        }

        data class Experience(
            val name: String,
            val title: String,
            val description: ExperienceParagraph,
        ) : JsonExport {
            override fun toJson(): Json = json(
                "name" to name,
                "title" to title,
                "description" to description.value,
            )
        }
    }
}


value class MultilineParagraph private constructor(
    val value: String,
) {
    companion object {
        operator fun invoke(vararg paragraphs: String): MultilineParagraph {
            require(paragraphs.isNotEmpty()) {
                "You should at least put one paragraph"
            }
            var parsed = "<0>"
            paragraphs.forEachIndexed { index, paragraph ->
                if (index != 0) parsed += "<$index>"
                parsed += paragraph
                parsed += "</$index>"
            }

            return MultilineParagraph(
                value = parsed,
            )
        }
    }
}

value class ExperienceParagraph private constructor(
    val value: String,
) {
    companion object {
        operator fun invoke(highlight: String, vararg paragraphs: String): ExperienceParagraph {
            return ExperienceParagraph(
                value = "$highlight\n- ${
                    paragraphs.joinToString("\n- ")
                }",
            )
        }
    }
}
