package dev.tonholo.resume.locale

object English : Locale {
    override val screens = object : Screen {
        override val home = HomePage(
            info = HomePage.InfoSection(
                jobTitle = "Software Engineer",
                about = MultilineParagraph(
                    "Software engineer with 10 years of experience delivering tech solutions. An avid programmer and fast learner.",
                    "Always advocating for optimal user experience while ensuring technological feasibility. Ability to work with several languages, frameworks, and paradigms at the same time.",
                    "A team-oriented developer which understands helping my colleagues we'll grow together. I love simple and elegant solutions for every problem, but understanding that simplicity and elegance must not degrade performance.",
                ),
            ),
            skills = HomePage.SkillSection(
                languages = HomePage.SkillSection.Languages(
                    title = "Languages",
                    en = "English",
                    pt = "Portuguese",
                ),
                programingLanguages = HomePage.SkillSection.ProgrammingLanguages(
                    title = "Skills",
                    ctaShowMore = "Show more",
                    ctaShowLess = "Show less",
                ),
            ),
            historySection = HomePage.HistorySection(
                work = HomePage.HistorySection.WorkHistory(
                    title = "Experience",
                    technologiesUsed = "Technologies used:",
                    experiences = listOf(
                        HomePage.HistorySection.Experience(
                            name = "REDspace",
                            description = ExperienceParagraph(
                                highlight = "Designing and developing robust, maintainable and standards-compliant mobile applications and libraries for the Android Platform.",
                                "Designing, architecting, and maintaining high-performance, reusable, and reliable Kotlin/Java code.",
                                "Using profiling techniques and software to identify and correct memory management problems and performance bottlenecks.",
                                "Delivering high-quality, robust, feature-specific software on schedule.",
                            ),
                            title = "Android Engineer",
                            starting = "2022/03/28",
                            technologiesUsed = listOf(
                                "Android",
                                "Kotlin",
                                "Hilt",
                                "Jetpack Compose",
                                "git",
                                "Java",
                            )
                        ),
                        HomePage.HistorySection.Experience(
                            name = "BairesDev / Pinterest",
                            description = ExperienceParagraph(
                                highlight = "Working designing solutions, optimizing and maintaining frameworks that empower the engineering team to deliver the best possible experience for people who use Pinterest.",
                                "Working with dynamic feature module, improving build speed.",
                                "Working closely with product engineering team creating enablers to new products development.",
                                "Maintaining unit and integration tests ensuring code quality.",
                                "Started migration of XML views to Jetpack Compose.",
                            ),
                            title = "Android Engineer",
                            starting = "2021/07/23",
                            ending = "2022/03/18",
                            technologiesUsed = listOf(
                                "Android",
                                "Kotlin",
                                "Play Feature Delivery",
                                "Dagger2",
                                "Hilt",
                                "Jetpack Compose",
                                "Java",
                                "Phabricator",
                                "git",
                                "Jira",
                            )
                        ),
                        HomePage.HistorySection.Experience(
                            name = "Questrade Financial Group",
                            description = ExperienceParagraph(
                                highlight = "Technical leadership, coaching the new team working on the new apps for Questrade, using React Native. Designed solutions event-based with high availability to support the new apps and the huge customer demand.",
                                "Implemented React Native module to support biometric authentication and OIDC Auth code + PCKE flow.",
                                "Designed and developed event-based microservices using Apache Kafka and Google Pub-Sub.",
                                "Designed and developed a mock service with payload validation, based on the open API contract, in order to enable mobile development during microservice creation.",
                            ),
                            title = "Principal Software Engineer",
                            starting = "2019/10/01",
                            ending = "2021/07/23",
                            technologiesUsed = listOf(
                                "Android",
                                "Kotlin",
                                "iOS",
                                "Swift",
                                "Bitrise",
                                "C#",
                                ".NET Core",
                                "GCP",
                                "TypeScript",
                                "NodeJS",
                                "git",
                                "Jenkins",
                                "Datadog",
                                "Jira",
                                "GitLab",
                            )
                        ),
                        HomePage.HistorySection.Experience(
                            name = "Questrade Financial Group",
                            description = ExperienceParagraph(
                                highlight = "Implemented new features and improved the performance and quality of the Questrade mobile hybrid app. Implemented a new authentication method using biometric authentications (Fingerprint for Android, TouchID and FaceID for iOS). Development of a whole new authentication process for mobile, desktop and web, based on Identity Server.",
                                "Increased customer satisfaction in the hybrid mobile app from 1.5 to 3.3 stars for an application with 100.000+ daily usage.",
                                "Created a secure authentication method for the hybrid app using native code (Kotlin for Android and Swift for iOS), with all data encrypted using the RSA method.",
                                "Executed new authentication project from concept through to completion, including mobile integration, front and back-end implementation, logging, metrics and delivery.",
                            ),
                            title = "Senior Software Engineer",
                            starting = "2017/08/28",
                            ending = "2019/10/01",
                            technologiesUsed = listOf(
                                "Android",
                                "Kotlin",
                                "Java",
                                "iOS",
                                "Swift",
                                "Objective-C",
                                "Cordova",
                                "C#",
                                ".NET Core",
                                "git",
                                "SVN",
                                "Jenkins",
                                "Jira",
                                "gitLab",
                            )
                        ),
                        HomePage.HistorySection.Experience(
                            name = "Axxiom",
                            description = ExperienceParagraph(
                                highlight = "Designed and implemented a new app from scratch for CEMIG, the energy company from Minas Gerais, using Android native. Integration with Google Maps showing objects that need repairs or installation.",
                                "Designed an application using the Material Design pattern.",
                                "Distributed application that communicates with others using AIDL.",
                                "Designed and developed a notification center that provides messages between the base and the apps using the best available connection (Wi-Fi, Mobile Network or Satellite connection)."
                            ),
                            title = "Mobile Analyst Developer",
                            starting = "2015/06/08",
                            ending = "2017/08/18",
                            technologiesUsed = listOf(
                                "Android",
                                "Java",
                                "SQLite",
                                "Symmetric DS",
                                "Google Maps API",
                                "C#",
                                "git",
                                "Jira",
                                "Stash",
                                "Bamboo",
                                "Informix",
                            )
                        ),
                        HomePage.HistorySection.Experience(
                            name = "Planear Sistemas",
                            description = ExperienceParagraph(
                                highlight = "Designed solutions to Health care management and marketing area. Developed a mobile application to manage medical scheduling, treatment prescriptions, and financial receipts. Developed an application to the marketing area creating dynamic surveys in the mobile app.",
                                "Implemented both mobile and web solutions to manage health clinics and public polyclinics managing themselves.",
                                "Created a dynamic application that receives data from RESTful service and builds a dynamic form based on that.",
                                "Created a social network to help politics and his supporters in his campaign using gamification.",
                            ),
                            title = "Analyst Developer .NET",
                            starting = "2013/02/01",
                            ending = "2015/06/08",
                            technologiesUsed = listOf(
                                "C#",
                                "Android",
                                "Java",
                                "RESTful",
                                "SVN",
                                "SQL Server",
                                "Unity 3D",
                                "JavaScript",
                                "ASP.NET WebForms",
                                "ASP.NET MVC 5",
                            )
                        ),
                    ),
                ),
                educational = HomePage.HistorySection.EducationalHistory(
                    title = "Education",
                    experiences = listOf(
                        HomePage.HistorySection.Experience(
                            name = "University center UNA",
                            title = "Post-graduate, Development of Application for Mobile Devices",
                            description = ExperienceParagraph(
                                highlight = "- Development of applications to iOS, Android, Windows Phone.\n- Development of hybrid applications focused on Cordova (ionic) and Xamarin.",
                            ),
                            starting = "2015/03/20",
                            ending = "2016/01/09",
                        ),
                        HomePage.HistorySection.Experience(
                            name = "PUC-MG",
                            title = "Technologist, Digital games",
                            description = ExperienceParagraph(
                                highlight = "Development of Digital Games using Unity3D engine, DirectX and OpenGL.",
                            ),
                            starting = "2012/02/01",
                            ending = "2014/09/10",
                        ),
                        HomePage.HistorySection.Experience(
                            name = "COTEMIG",
                            title = "Computer Technician",
                            description = ExperienceParagraph(
                                highlight = "",
                            ),
                            starting = "2010/01/01",
                            ending = "2012/01/01",
                        ),
                    ),
                ),
            ),
        )
    }

    override val navBar: NavBar = object : NavBar {
        override val home: String = "Home"
        override val articles: String = "Articles"
        override val resume: String = "Resume"
    }
}
