pipeline{
    agent any
    tools{
        maven 'maven_3_5_0'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/basanta-spring-boot/devops-automation']]])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps {
                script {
                    sh 'docker build -t javatechie/devops-automation1 .'
                }
            }
        }
        stage('Push Docker image'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'docker-hub', variable: 'dockerpwd')]) {
                    sh 'docker login -u javatechie -p ${dockerpwd}'

}


                    sh 'docker push javatechie/devops-automation1'

                }
            }
        }
    }
}