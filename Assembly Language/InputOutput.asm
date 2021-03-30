.model small        ;Code And Data Segment
.stack 100h         ;Memory Size
 
.data
MSG1 DB 3           ;msg->veriable,db/dw->msg variable jnno memory allocate 
MSG2 DB ?           ;?->user kase thake unkonwn value nivo

.code        

main proc 
    
    ;Data segment initial
    MOV AX,@DATA  ;AX-> BY DEFAULT
    MOV DS,AX
    
    ;Input Segment
    MOV AH,1
    INT 21H         
    mov MSG2,AL       
    
    ;Output Segment 
      ;MSG1 VARIABLE OUTPUT
    MOV AH,2
    ADD MSG1,48        
    MOV DL,MSG1      
    INT 21H
             
      ;MSG2 VARIABLE OUTPUT
    MOV AH,2
    MOV DL,MSG2
    INT 21H
    
    EXIT:
    MOV AH,4CH
    INT 21H
    MAIN ENDP
end main