.model small
.stack 100h

.code
main proc
      
      MOV AX,10101011B
      ;MOV BX,01111111B 
      
      ;AND AX,BX 
      
      ;OR  AX,BX 
      
      ;XOR AX,BX ;CLEAR
      
      ;NOT AX 
      
      ;SHL AX,1 ;1 (UNSINGE)GOR SHIFT(01010110)
      
      ;SAL AX,1 ;ARITHEMETIC SHIFT(SIGIN NUBER)
      
      ;SHR AX,1 ;RIGHT SHIFT
       
      ;ROL AX,1 ;01010111B 
      ;ROR AX,1 ;11010101B 
      RCL AX,1
      ;RCR AX,1
    
    ; exit:
    ;mov ah,4ch
    ;int 21h
    main endp
end main