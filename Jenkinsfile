pipeline {
    agent any

    tools {
        maven 'Maven'  // Ensure Maven is available in Jenkins
        jdk 'JDK'         // Ensure JDK 11 is available in Jenkins
    }

    environment {
        // Define the path to the JAR file
        JAR_PATH = 'target/MyMavenGuavaApp-1.0-SNAPSHOT.jar'
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone your Git repository
                git url: 'https://github.com/Riya-Singh-Unofficial/GuavaTest.git'

            }
        }

        stage('Build JAR') {
            steps {
                // Use Maven to clean and package the project, creating a JAR file
                sh 'mvn clean package'
            }
        }

        stage('Run Application') {
            steps {
                // Run the JAR file using the 'java -jar' command
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }

    post {
        success {
            echo 'Build and execution successful!'
        }
        failure {
            echo 'Build or execution failed!'
        }
    }
}
