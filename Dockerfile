FROM gradle:8.3.0-jdk20

WORKDIR /HexletJavalin

COPY /HexletJavalin .

RUN gradle installDist

CMD ./build/install/HexletJavalin/bin/HexletJavalin