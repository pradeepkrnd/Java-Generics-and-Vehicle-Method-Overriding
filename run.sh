#!/usr/bin/env bash
set -eu
cd "$(dirname "$0")"
mkdir -p build
javac -Xlint:rawtypes,unchecked -d build src/*.java
java -cp build VehicleDemo
java -cp build GenericSafetyDemo
