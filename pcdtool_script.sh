#!/bin/bash
set +x

COM_PORT=$1
BAUD_RATE=$2

/tms/PCD_Tool_Linux/bin/pcdtool_static -i:/tms/PCD_Tool_Linux/bin/PPA_v0205_RS232_57K6.zip -d -p:$COM_PORT -o:"$BAUD_RATE,8,n,1" >> /tms/PCD_Tool_Linux/result.log