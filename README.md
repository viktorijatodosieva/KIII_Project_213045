# Java CI/CD DevOps Demo Project

A full-stack DevOps demo project built in **Java**, created as part of my **faculty coursework**. This project demonstrates real-world usage of **CI/CD pipelines**, **Docker**, **Kubernetes**, and **GitHub Actions** to automate building, testing, and deployment of a Java application.

## 🎓 About the Project

This repository was developed for a university subject related to **DevOps practices**. The focus is on showcasing a professional CI/CD setup integrated with cloud-native tools.

## 🧰 Technologies Used

- **Language:** Java
- **CI/CD:** GitHub Actions
- **Containerization:** Docker
- **Orchestration:** Kubernetes (Minikube / k3d)
- **Scripting:** YAML

## 📁 Project Structure

```
.github/workflows/   — GitHub Actions pipeline definitions  
Dockerfile           — Docker image config for Java app  
k8s/                 — Kubernetes manifests (Deployment, Service)  
src/                 — Java source code  
pom.xml / build.gradle — Java build configuration  
```

## 🔄 CI/CD Pipeline Overview

1. Push to the `master` branch triggers the GitHub Actions CI workflow  
2. Java code is built and packaged (handled locally or manually)  
3. A Docker image is built and pushed to Docker Hub using GitHub Actions  
4. Kubernetes deployment is currently performed manually (not automated in the workflow)


## ✅ GitHub Actions Workflow

Check the workflow definition under:

```
.github/workflows/ci-cd.yml
```

It automates:
- Docker image build using Docker Buildx
- Authentication and push to Docker Hub
- Caching Docker layers for faster builds




