package dev.tonholo.resume.locale

object Portuguese : Locale {
    override val screens = object : Screen {
        override val home = HomePage(
            info = HomePage.InfoSection(
                jobTitle = "Engenheiro de Software",
                about = MultilineParagraph(
                    "Engenheiro de software com 10 anos de experiência entregando soluções tecnológicas. Um programador ávido e com habilidade de aprendizado rápida.",
                    "Sempre advogo para a melhor experiência de usuário garantindo viabilidade tecnológica. Tenho facilidade em trabalhar com\\ndiversas linguagens, frameworks e paradigmas ao mesmo tempo.",
                    "Um desenvolvedor orientado a time que entende que juntos, todos crescemos. Amo soluções elegantes e simples para todos os problemas, mas entendendo que esta elegância e simplicidade não podem sobrepor a performance do software.",
                ),
            ),
            skills = HomePage.SkillSection(
                languages = HomePage.SkillSection.Languages(
                    title = "Languages",
                    en = "Inglês",
                    pt = "Português",
                ),
                programingLanguages = HomePage.SkillSection.ProgrammingLanguages(
                    title = "Habilidades",
                    ctaShowMore = "Mostrar mais",
                    ctaShowLess = "Mostrar menos",
                ),
            ),
            historySection = HomePage.HistorySection(
                work = HomePage.HistorySection.WorkHistory(
                    title = "Experiência",
                    technologiesUsed = "Tecnologias utilizadas:",
                    experiences = listOf(
                        HomePage.HistorySection.Experience(
                            name = "REDspace",
                            description = ExperienceParagraph(
                                highlight = "Projetando e desenvolvendo aplicações mobile robustas, fácil manutenção e em conformidade com os padrões de aplicações e bibliotecas para a plataforma Android.",
                                "Projetando, arquitetando e mantendo código Kotlin/Java de alto desempenho, reutilizável e confiável.",
                                "Usando técnicas e softwares de profiling para identificar e corrigir problemas de gerenciamento de memória e gargalos de desempenho.",
                                "Entregando apps robustos, de alta qualidade dentro do cronograma.",
                            ),
                            title = "Android Engineer",
                        ),
                        HomePage.HistorySection.Experience(
                            name = "BairesDev / Pinterest",
                            description = ExperienceParagraph(
                                highlight = "Desenvolvendo soluções, optimizações e mantendo frameworks que ajudam o time de engenheiros de Software a entregar a melhor experiência possível para quem utiliza o Pinterest",
                                "Trabalhando com dynamic feature module, melhorando a velocidade de compilação do app.",
                                "Trabalhando em conjunto com o time de engenheiros de produto criando facilitadores para desenvolvimento de novos produtos.",
                                "Manutenção de unit e integration tests garantindo a qualidade de código",
                                "Iniciei o processo de migração de views que utilizavão XML para o Jetpack Compose",
                            ),
                            title = "Android Engineer",
                        ),
                        HomePage.HistorySection.Experience(
                            name = "Questrade Financial Group",
                            description = ExperienceParagraph(
                                highlight = "Liderança técnica, guiando o novo time que trabalha nos novos apps para Questrade, usando React Native. Participação direta no desenho e riação =  soluções baseadas em eventos com alta disponibilidade para suportar os novos aplicativos e a enorme demanda dos clientes",
                                "Implementação de React Native module para suportar autenticação utilizando biometria e OIDC Auth code + PCKE flow.",
                                "Projetado e desenvolvido microsserviços baseados em eventos usando Apache Kafkae Google Pub-Sub.",
                                "Projetado e um serviço mock com validação de payload, baseado no contrato de API Open API, a fim de permitir o desenvolvimento móvel durante a criação dos endpoints.",
                            ),
                            title = "Principal Software Engineer",
                        ),
                        HomePage.HistorySection.Experience(
                            name = "Questrade Financial Group",
                            description = ExperienceParagraph(
                                highlight = "Implementadas novas funcionalidades e melhorou o desempenho e a qualidade do app híbrido móvel Questrade. Implementação de um novo método de utenticação =tilizando autenticações biométricos (Fingerprint para Android, TouchID e FaceID para iOS). Desenvolvimento de todo um novo processo de utenticação = ra mobile, desktop e web, baseado em Identity Server",
                                "Aumento da satisfação do cliente no aplicativo móvel híbrido de 1,5 para 3,3 estrelas para um aplicativo com mais de 100.000 uso diário.",
                                "Criado um método de autenticação segura para o app usando código nativo (Kotlin para Android e Swift para iOS), com todos os dados criptografados usando RSA.",
                                "Execução de um novo projeto de autenticação desde o conceito até a conclusão, incluindo integração móvel, implementação de front e back-end, registro, métricas e entrega.",
                            ),
                            title = "Senior Software Engineer",
                        ),
                        HomePage.HistorySection.Experience(
                            name = "Axxiom",
                            description = ExperienceParagraph(
                                highlight = "Projetei e implementei um novo aplicativo do zero para a CEMIG, empresa mineira de energia, usando Android nativo. Integração com Google Maps mostrando objetos que precisam de reparos ou instalação",
                                "Projetado um aplicativo usando o padrão de design de materiais.",
                                "Aplicação distribuída que se comunica com os outros usando AIDL.",
                                "Concebido e desenvolvido um centro de notificação que fornece mensagens entre a base e os aplicativos usando a melhor conexão disponível (Wi-Fi, rede móvel ou conexão de satélite).",
                            ),
                            title = "Analista Desenvolvedor Mobile",
                        ),
                        HomePage.HistorySection.Experience(
                            name = "Planear Sistemas",
                            description = ExperienceParagraph(
                                highlight = "Soluções para a área de gestão de saúde e para a área de marketing. Desenvolvido um aplicativo móvel para gerenciar agendamento médico, rescrições =  tratamento e recebimentos financeiros. Também foi desenvolvido um aplicativo para a área de marketing criando pesquisas dinâmicas no aplicativo mobile",
                                "Implementado ambas as soluções móveis e da Web para gerenciar clínicas de saúde e policlínicas públicas.",
                                "Criado um aplicativo dinâmico que recebe dados do serviço RESTful e constrói uma forma dinâmica com base nisso.",
                                "Criado uma rede social para a política de ajuda e seus partidários em sua campanha usando gamification.",
                            ),
                            title = "Analista Desenvolvedor .NET",
                        ),
                    ),
                ),
                educational = HomePage.HistorySection.EducationalHistory(
                    title = "Formação acadêmica",
                    experiences = listOf(
                        HomePage.HistorySection.Experience(
                            name = "Centro universitário UNA",
                            title = "Pós graduação, Desenvolvimento de aplicativos móveis",
                            description = ExperienceParagraph(
                                "- Desenolvimento de aplicativos para iOS, Android e Windows Phone.\n- Desenvolvimento de aplicações híbridas com foco em Cordova (ionic) e Xamarin.",
                            ),
                        ),
                        HomePage.HistorySection.Experience(
                            name = "PUC-MG",
                            title = "Tecnólogo, Jogos digitais",
                            description = ExperienceParagraph(
                                "Desenvolvimento de jogos digitais utilizando Unity3D engine, DirectX e OpenGL."
                            ),
                        ),
                        HomePage.HistorySection.Experience(
                            name = "COTEMIG",
                            title = "Técnico em informática",
                            description = ExperienceParagraph(
                                "",
                            ),
                        ),
                    ),
                ),
            ),
        )
    }

    override val navBar: NavBar = object : NavBar {
        override val home: String = "Início"
        override val articles: String = "Artigos"
        override val resume: String = "Currículo"
    }
}

