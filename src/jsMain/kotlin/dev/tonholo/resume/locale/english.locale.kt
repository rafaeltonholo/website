package dev.tonholo.resume.locale

import kotlin.js.json

val en = json(
    "screens" to json(
        "home" to json(
            "info" to json(
                "jobTitle" to "Software Engineer",
                "about" to "<0>Software engineer with 10 years of experience delivering tech solutions. An avid programmer and fast learner.</0><1>Always advocating for optimal user experience while ensuring technological feasibility. Ability to work with several languages, frameworks, and paradigms at the same time.</1><2>A team-oriented developer which understands helping my colleagues we'll grow together. I love simple and elegant solutions for every problem, but understanding that simplicity and elegance must not degrade performance.</2>"
            ),
            "skills" to json(
                "languages" to json(
                    "title" to "Languages",
                    "en" to "English",
                    "pt" to "Portuguese",
                ),
                "programingLanguages" to json(
                    "title" to "Skills",
                    "ctaShowMore" to "Show more",
                    "ctaShowLess" to "Show less",
                ),
            ),
        ),
    ),
)
/*
{
  "screens": {
    "home": {
      "history": {
        "work": {
          "title": "Experience",
          "technologiesUsed": "Technologies used:",
          "experiences": [
            {
              "name": "REDspace",
              "description": "Designing and developing robust, maintainable and standards-compliant mobile applications and libraries for the Android Platform. <0><1>Designing, architecting, and maintaining high-performance, reusable, and reliable Kotlin/Java code.</1><2>Using profiling techniques and software to identify and correct memory management problems and performance bottlenecks.</2><3>Delivering high-quality, robust, feature-specific software on schedule.</3></0>",
              "title": "Android Engineer"
            },
            {
              "name": "BairesDev / Pinterest",
              "description": "Working designing solutions, optimizing and maintaining frameworks that empower the engineering team to deliver the best possible experience for people who use Pinterest.<0><1>Working with dynamic feature module, improving build speed.</1><2>Working closely with product engineering team creating enablers to new products development.</2><3>Maintaining unit and integration tests ensuring code quality.</3><4>Started migration of XML views to Jetpack Compose.</4></0>",
              "title": "Android Engineer"
            },
            {
              "name": "Questrade Financial Group",
              "description": "Technical leadership, coaching the new team working on the new apps for Questrade, using React Native. Designed solutions event-based with high availability to support the new apps and the huge customer demand.<0><1>Implemented React Native module to support biometric authentication and OIDC Auth code + PCKE flow.</1><2>Designed and developed event-based microservices using Apache Kafka and Google Pub-Sub.</2><3>Designed and developed a mock service with payload validation, based on the open API contract, in order to enable mobile development during microservice creation.</4></1>",
              "title": "Principal Software Engineer"
            },
            {
              "name": "Questrade Financial Group",
              "description": "Implemented new features and improved the performance and quality of the Questrade mobile hybrid app. Implemented a new authentication method using biometric authentications (Fingerprint for Android, TouchID and FaceID for iOS). Development of a whole new authentication process for mobile, desktop and web, based on Identity Server.<0><1>Increased customer satisfaction in the hybrid mobile app from 1.5 to 3.3 stars for an application with 100.000+ daily usage.</1><2>Created a secure authentication method for the hybrid app using native code (Kotlin for Android and Swift for iOS), with all data encrypted using the RSA method.</2><3>Executed new authentication project from concept through to completion, including mobile integration, front and back-end implementation, logging, metrics and delivery.</3></0>",
              "title": "Senior Software Engineer"
            },
            {
              "name": "Axxiom",
              "description": "Designed and implemented a new app from scratch for CEMIG, the energy company from Minas Gerais, using Android native. Integration with Google Maps showing objects that need repairs or installation.<0><1>Designed an application using the Material Design pattern.</1><2>Distributed application that communicates with others using AIDL.</2><3>Designed and developed a notification center that provides messages between the base and the apps using the best available connection (Wi-Fi, Mobile Network or Satellite connection).</3></0>",
              "title": "Mobile Analyst Developer"
            },
            {
              "name": "Planear Sistemas",
              "description": "Designed solutions to Health care management and marketing area. Developed a mobile application to manage medical scheduling, treatment prescriptions, and financial receipts. Developed an application to the marketing area creating dynamic surveys in the mobile app.<0><1>Implemented both mobile and web solutions to manage health clinics and public polyclinics managing themselves.</1><2>Created a dynamic application that receives data from RESTful service and builds a dynamic form based on that.</2><3>Created a social network to help politics and his supporters in his campaign using gamification.</3></0>",
              "title": "Analyst Developer .NET"
            },
            {
              "name": "FAC Sistemas",
              "description": "Designed and implemented websites for townhalls and clients by demand. Created a CMS to allow users to manage the website content without any external help.<0><1>Designed an internal framework helping with website creation using PHP.</1><2>CMS created from scratch using PHP.</2><3>Created an e-commerce system for a jewelry store showing jewels available to buy, showing prices with a zoom capability in its photos.</3><4>Designed and implemented townhall transparency home page, fetching financial data from it.</4></0>",
              "title": "Web Developer"
            },
            {
              "name": "Agência Boreal",
              "description": "Websites and communication portals created by the demand to clients from a marketing agency.<0><1>Created a communication portal for an education company, using WordPress, PHP and MySQL.</1><2>Created a website to an Architect that shows her projects in detail with photos and integrating with Facebook, letting users comment and share the website’s content.</2></0>",
              "title": "Web Developer"
            }
          ]
        },
        "educational": {
          "title": "Education",
          "experiences": [
            {
              "name": "University center UNA",
              "title": "Post-graduate, Development of Application for Mobile Devices",
              "description": "- Development of applications to iOS, Android, Windows Phone.\n- Development of hybrid applications focused on Cordova (ionic) and Xamarin."
            },
            {
              "name": "PUC-MG",
              "title": "Associate's degree, Digital games",
              "description": "Development of Digital Games using Unity3D engine, DirectX and OpenGL."
            },
            {
              "name": "COTEMIG",
              "title": "Computer Technician",
              "description": ""
            }
          ]
        }
      }
    }
  }
}

 */
