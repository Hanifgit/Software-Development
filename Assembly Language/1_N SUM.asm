.model small
.stack 100h

.Data
  I DW 1
  AD DW ?
  
.code 
main proc
    
    MOV AX,@DATA
    MOV DS,AX
    
    MOV AH,1
    INT 21H 

    SUB AL,48
    
    MOV CX,0
    MOV CL,AL
    
    MOV BX,0
    
    SUM:
     ADD BX,I
     INC I
     LOOP SUM
     
     MOV AD,BX
    
    exit:
    main endp
end main