.model small
.stack 100h 
.data
a DB 'Input first digit: $'
b DB 10,13,'Input second digit: $'
c DB 10,13,'Result: $'

.code

main proc
    
    MOV AX,@DATA
    MOV DS,AX
     
    ;a string print
    MOV AH,9
    LEA DX,a
    INT 21H
    
    ;First Digit Input
    MOV AH,1
    INT 21H
    MOV BL,AL 
    
    
    ;b string print
    MOV AH,9
    LEA DX,b
    INT 21H
    
    ;Second Digit Input
    MOV AH,1
    INT 21H
    MOV CL,Al
    
    
    ;c string print
    MOV AH,9
    LEA DX,c
    INT 21H
    
    ;subtract
    SUB BL,CL ;BL = BL+CL 
    ADD BL,48
    ;Result Print
    MOV AH,2
    MOV DL,BL
    INT 21H
    
    
    exit:
    mov ah,4ch
    int 21h
    main endp
end main