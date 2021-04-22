# quarkus-metrics project

## deploy into openshift
```
oc new-project svc-app-monitoring
mvn clean package -DskipTests -Dquarkus.kubernetes.deploy=true -Dquarkus.openshift.expose=true -Dquarkus.openshift.labels.app-with-metrics=svc-app
## if OCP 4.6 & above
oc apply -f cluster-monitoring-config.yaml *OR* 
## if OCP 4.5 or less
oc apply -f cluster-monitoring-config-ocp45.yaml 
oc apply -f service-monitor.yaml
```

