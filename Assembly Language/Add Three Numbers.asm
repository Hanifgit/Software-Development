.model small
.stack 100h 
.data
a DB 'Input first digit: $'
b DB 'Input second digit: $'
d DB 'Input third digit: $'
c DB 'Result: $'
Var DB ?

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
    MOV BH,AL
    
    ;New Line
    MOV AH,2
    MOV DL,10
    INT 21H
    MOV DL,13
    INT 21H 
    
    ;d string print
    MOV AH,9
    LEA DX,b
    INT 21H
    
    ;Third Digit Input
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
    ADD BL,BH ;BL = BL+CL
    SUB BL,48 
    
    MOV CH,BL
    
    ADD CH,CL
    SUB CH,48 
    
    MOV Var,CH
    
    ;Result Print
    MOV AH,2
    MOV DL,Var
    INT 21H
    
    
    exit:
    mov ah,4ch
    int 21h
    main endp
end main