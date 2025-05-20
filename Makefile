build-deploy-image:
	@echo "Building the Maven project..."
	@mvn clean install
	@echo "Maven project built successfully."
	@echo "Building and deploying the image..."
	@docker build -f src/main/docker/Dockerfile.jvm -t my-image .
	@docker run -i --rm -p 8080:8080 my-image
	@echo "Image built and deployed successfully."