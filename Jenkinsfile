pipeline {
    agent any

    tools {
        jdk 'Temurin-17'                // Name defined in Global Tool Configuration
        maven 'Apache Maven 3.9.9'      // Name defined in Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn -B clean test'  // Use `bat` for Windows
            }
        }
    }

    post {
        always {
            // Publish test results
            junit '**/target/surefire-reports/TEST-*.xml'
        }

        success {
            mail to: 'dalibor.culum@asioso.com',
                 subject: "✅ Jenkins Job '${env.JOB_NAME} [#${env.BUILD_NUMBER}]' Succeeded",
                 body: """Good news!

The Jenkins job '${env.JOB_NAME}' completed successfully.

🔗 View it here: ${env.BUILD_URL}"""
        }

        failure {
            mail to: 'dalibor.culum@asioso.com',
                 subject: "❌ Jenkins Job '${env.JOB_NAME} [#${env.BUILD_NUMBER}]' Failed",
                 body: """Something went wrong.

The Jenkins job '${env.JOB_NAME}' has failed.

🔗 Check the logs: ${env.BUILD_URL}"""
        }
    }
}
