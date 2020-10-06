#!/bin/bash

kubectl taint nodes minikube key=value:NoSchedule
kubectl taint nodes minikube key=value:NoExecute

# remove the taint
# kubectl taint nodes minikube key:NoSchedule-