kind: "BuildConfig"
apiVersion: "v1"
metadata:
  name: "workshop-pipeline"
  annotations:
    pipeline.alpha.openshift.io/uses: '[{"name": "workshop-openshift", "kind": "DeploymentConfig"}]'
spec:
  source:
    type: "Git"
    git:
      uri: "http://github.com/gersoncfbr/workshop-openshift.git"
  strategy:
    type: "JenkinsPipeline"
    jenkinsPipelineStrategy:
      jenkinsfilePath: "jenkins-pipeline.groovy"
