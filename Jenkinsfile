pipeline { 
    agent any  
    environment{
        PATH="E:/apache-maven-3.9.9/bin:$PATH"
    }

    stages { 
        stage('Initialize') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
        stage('Maven Build'){
        	steps{
        	    bat "mvn clean install"
        	}
            
        }

    }
}