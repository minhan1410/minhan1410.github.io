package main

import "github.com/gofiber/fiber/v2"
// import "fmt"

func main() {
	app := fiber.New()
	
	app.Get("/", func(c *fiber.Ctx) error {
	   return c.SendString("Hello,anh An 👋!")
	})

	app.Listen(":1410")

	// fmt.Println("Hello")
}
