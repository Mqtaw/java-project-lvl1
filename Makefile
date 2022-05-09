rebuild:
	./gradlew clean
	./gradlew installDist


run-dist:
	./build/install/app/bin/app
