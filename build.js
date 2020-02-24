const {exec} = require('child_process');
const gradleCommand = process.platform == 'win32' ? 'gradlew.bat bundle' : './gradlew bundle';

exec(gradleCommand, (err, stdout, stderr) => {
    if (err) {
        console.error(stderr);
        return;
    }
    else {
        console.log(stdout);
    }
});