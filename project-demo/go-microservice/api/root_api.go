package api

import (
	"github.com/gin-gonic/gin"
	"net/http"
)

//Root root api
func Root(c *gin.Context) {
	c.JSON(http.StatusOK, "Hello Golang.")
	return
}