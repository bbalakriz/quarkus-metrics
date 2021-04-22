# quarkus-metrics 

## Deploying into openshift
```
oc new-project svc-app-monitoring
mvn clean package -DskipTests -Dquarkus.kubernetes.deploy=true -Dquarkus.openshift.expose=true -Dquarkus.openshift.labels.app-with-metrics=svc-app
```
## If OCP 4.6 & above, apply the cluster-monitoring-config
```
oc apply -f cluster-monitoring-config.yaml
```
*OR* 

## If OCP 4.5 or less, apply the cluster-monitoring-config
```
oc apply -f cluster-monitoring-config-ocp45.yaml
```
## Apply the prometheus service monitor for the OCP project
```
oc apply -f service-monitor.yaml
```

