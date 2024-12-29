pipeline { 
    agent any  
    tools{
        maven "maven-3.9.9"
        jdk "jdk-21"
    }
    stages { 
        stage('Initialize') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
        stage('Maven Build'){
        	steps{
        	    bat "mvn clean package"
        	}
            
        }

    }
}