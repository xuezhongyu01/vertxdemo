package com.xllyll.demo.vertx;

import io.vertx.core.Vertx;

public class APP {

    public static void main(String[] args) {
        Vertx.vertx().createHttpServer().requestHandler(req -> req.response()
                .end("Hello World!")).listen(8080);
    }
}
