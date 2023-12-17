# k8s-learning

## Greeting Service

### Start up

#### Via Helm
```
helm install greeting db
```
```
helm install greeting app
```
```
helm install nginx-ingress nginx-stable/nginx-ingress
```

#### Via direct manifest files
```
kubectl apply -f greeting/k8s/manifest/db/postgres-secret.yml -f greeting/k8s/manifest/db/postgres-configmap-init.yml -f greeting/k8s/manifest/db/postgres-statefulset.yml -f greeting/k8s/manifest/db/postgres-service.yml
```
```
kubectl apply -f greeting/k8s/configmap.yml -f greeting/k8s/deployment.yml -f greeting/k8s/service.yml
```

### Additional

#### Connect to the PostgreSQL DB 
```
psql -U <username> -h <hostname> -d <database>
```

#### Installing NGINX Ingress Controller
```
helm repo add nginx-stable https://helm.nginx.com/stable
helm repo update
helm install nginx-ingress nginx-stable/nginx-ingress
```