FROM python:3.7-slim
  
WORKDIR /app-server

ADD requirements.txt /app-server/
RUN pip3 install -r /app-server/requirements.txt

ADD hello.py /app-server/
ADD start.sh /app-server/
RUN chmod +x start.sh
EXPOSE 8000
CMD ["./start.sh"]