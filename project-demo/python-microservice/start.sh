#!/bin/sh

export FLASK_APP=hello.py
python3 -m flask run --host=0.0.0.0 --port=8000
