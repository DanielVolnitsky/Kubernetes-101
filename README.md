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