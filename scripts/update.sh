#!/bin/bash

WORKING_DIR = $PWD

echo "updating on $WORKING_DIR"
sudo apt -y update
sudo apt -y upgrade
