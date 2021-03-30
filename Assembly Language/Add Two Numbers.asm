.model small
.stack 100h 
.data
a DB 'Input first digit: $'
b DB 'Input second digit: $'
c DB 'Result: $'

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
    
    ;New Line
    MOV AH,2
    MOV DL,10
    INT 21H
    MOV DL,13
    INT 21H 
    
    ;b string print
    MOV AH,9
    LEA DX,b
    INT 21H
    
    ;Second Digit Input
    MOV AH,1
    INT 21H
    MOV CL,Al
    
    ;New Line
    MOV AH,2
    MOV DL,10
    INT 21H
    MOV DL,13
    INT 21H 
    
    ;c string print
    MOV AH,9
    LEA DX,c
    INT 21H
    
    ;Addition
    ADD BL,CL ;BL = BL+CL
    SUB BL,48 
    
    ;Result Print
    MOV AH,2
    MOV DL,BL
    INT 21H
    
    
    exit:
    mov ah,4ch
    int 21h
    main endp
end main