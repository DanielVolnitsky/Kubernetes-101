# k8s-learning

### Start up greeting service
```
kubectl apply -f greeting/k8s/configmap.yml -f greeting/k8s/deployment.yml -f greeting/k8s/service.yml
```

### Start up greeting service DB
```
kubectl apply -f greeting/k8s/db/postgres-secret.yml -f greeting/k8s/db/postgres-configmap-init.yml -f greeting/k8s/db/postgres-statefulset.yml -f greeting/k8s/db/postgres-service.yml
```

### Delete all the greeting service resources
```
kubectl delete deployment --all && kubectl delete statefulset --all
```

### Additional
#### Connect to the PostgreSQL DB 
```
psql -U <username> -h <hostname> -d <database>
```