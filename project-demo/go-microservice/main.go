package main

import (
	"demo-api-go/api"
	"github.com/gin-gonic/gin"
)

func main() {
	router := gin.Default()
	router.GET("/", api.Root)
	router.Run(":8081")
}
