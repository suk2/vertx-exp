package com.devekhack.vertx.exp;

import io.vertx.core.AbstractVerticle;

public class Server extends AbstractVerticle {

	@Override
	public void start() {
		vertx.createHttpServer().requestHandler(req -> req.response().end("Hello World!")).listen(8080);
	}
}
