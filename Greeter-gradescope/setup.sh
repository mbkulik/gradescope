#!/usr/bin/env bash

set -eu -o pipefail
shopt -s failglob

# Gradle Versiopn
GRADLE_VER=7.5.1

# install packages
apt update -u
apt install -y openjdk-17-jdk-headless wget zip git

# setup gradle
wget -c https://services.gradle.org/distributions/gradle-$GRADLE_VER-bin.zip -P /tmp
unzip -d /opt/ /tmp/gradle-$GRADLE_VER-bin.zip

export PATH=/opt/gradle-$GRADLE_VER/bin:$PATH
