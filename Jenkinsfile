pipeline {
    agent any

    tools {
        jdk 'Temurin-17'        // Name defined in Global Tool Configuration
        maven 'Maven_3.9'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn -B clean test' // Use `bat` on Windows or `sh` if running on Linux
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }
}
