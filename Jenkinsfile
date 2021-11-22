properties([pipelineTriggers([githubPush()])])

pipeline {

    agent any
    tools {
            maven "jeanPomme"
    }
    stages {
        stage("build") {
            steps {
                echo 'running the build'
                git 'https://github.com/RemyMach/CI_exercise.git'
            }
        }

        stage("test") {
            steps {
                echo 'running the tests'
                sh "mvn -Dmaven.test.failure.ignore=true clean test"
            }
        }
    }
    post {
        failure {
            emailext body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test'
        }
    }

}