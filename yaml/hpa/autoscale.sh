#!/bin/bash
# create hpa
kubectl autoscale deployment php-apache --cpu-percent=50 --min=1 --max=10
# verify
kubectl get hpa
#increase load
kubectl run -i --tty load-generator --rm --image=busybox --restart=Never -- /bin/sh -c "while sleep 0.01; do wget -q -O- http://php-apache; done"