build-deploy-image-local-docker:
	@echo "Building the Maven project..."
	@mvn clean install
	@echo "Maven project built successfully."
	@echo "Building and deploying the image..."
	@docker build -f src/main/docker/Dockerfile.jvm -t my-image .
	@docker run -d -it --rm --name quarkus-app -p 8080:8080 my-image
	@echo "Image built and deployed successfully in Docker."

build-deploy-image-local-podman:
	@echo "Building the Maven project..."
	@mvn clean install
	@echo "Maven project built successfully."
	@echo "Building and deploying the image..."
	@podman build -f src/main/docker/Dockerfile.jvm -t quarkus-app .
	@podman run -dt -p 8080:8080 --pod new:my-first-pod quarkus-app:latest
	@echo "Image built and deployed successfully in Podman."

build-push-image-dockerhub:
	@echo "Building the Maven project..."
	@mvn clean install
	@echo "Maven project built successfully."
	@echo "Building and pushing the image..."
	@docker build -f src/main/docker/Dockerfile.jvm -t saiteja2182/quarkus-app:latest .
	@docker push saiteja2182/quarkus-app:latest
	@echo "Image built and pushed successfully."