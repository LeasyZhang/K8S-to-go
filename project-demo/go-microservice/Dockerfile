FROM golang:1.13 AS build-env
ENV GO111MODULE=on
WORKDIR /app/server
COPY go.mod .
COPY go.sum .
RUN go mod download
COPY . .
RUN GOOS=linux GOARCH=386 go build -v -o /app/server/demo-api

FROM alpine
RUN apk add -U tzdata
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai  /etc/localtime
WORKDIR /demo-api
COPY --from=build-env /app/server/demo-api /demo-api
EXPOSE 9000
CMD [ "./demo-api" ]