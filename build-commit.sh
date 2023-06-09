# Maven and Log4J log file
rm -f maven.log calculator.log
touch maven.log

# Build and test the maven project
mvn clean install test --log-file maven.log

# Pull any changes made in the UI
git pull origin main

# Add files to the staging area
git add .

# Open prompt for commit message
git commit 

# Push changes to the main branch
git push origin main
