pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
        org.jenkinsci.plugins.docker.commons.tools.DockerTool 'docker'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
               
            }
            
            }
         stage ('Docker') {
            steps{
        script {
          docker.build "demobackend:latest"
        }
      }
            
            }
           
        }
    
}
