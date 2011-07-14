To build you need to create local.properties file:

	android update project -p .

From here you can just run a regular android build:

	ant debug install && adb logcat