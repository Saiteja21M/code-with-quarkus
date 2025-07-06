build-deploy-image-local:
	@echo "Building the Maven project..."
	@mvn clean install
	@echo "Maven project built successfully."
	@echo "Building and deploying the image..."
	@docker build -f src/main/docker/Dockerfile.jvm -t my-image .
	@docker run -i --rm --name quarkus-app-demo -p 8082:8080 my-image
	@echo "Image built and deployed successfully."

build-push-image-dockerhub:
	@echo "Building and pushing the image..."
	@docker build -f src/main/docker/Dockerfile.jvm -t saiteja2182/quarkus-app:latest .
	@docker push saiteja2182/quarkus-app:latest
	@echo "Image built and pushed successfully."