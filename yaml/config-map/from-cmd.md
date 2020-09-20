# Use ConfigMap

## Use —from-literal

```bash
kubectl create configmap special-config --from-literal=special.how=very --from-literal=special.type=charm
```

Validation:

```bash
kubectl get cm special-config -o yaml
```

## From Folder

```bash
kubectl create configmap game-config --from-file=./properties
```

Validation:

```bash
kubectl get cm game-config -o yaml
```

## From File

```bash
kubectl create configmap game-config-2 --from-file=./properties/game.properties --from-file=./properties/ui.properties
```

Validation:

```bash
kubectl get cm game-config-2 -o yaml
```
