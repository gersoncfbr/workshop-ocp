kind: "BuildConfig"
apiVersion: "v1"
metadata:
  name: "workshop-pipeline"
  annotations:
    pipeline.alpha.openshift.io/uses: '[{"name": "workshop-ocp", "kind": "DeploymentConfig"}]'
spec:
  source:
    type: "Git"
    git:
      uri: "https://github.com/gersoncfbr/workshop-ocp.git"
  strategy:
    type: "JenkinsPipeline"
    jenkinsPipelineStrategy:
      jenkinsfilePath: "jenkins-pipeline.groovy"
