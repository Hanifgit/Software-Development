.model small
.stack 100h 
.data
a DB 'RAKIBUL AHASAN$'
b DB ' PAPON$'

.code

main proc
    
    MOV AX,@DATA
    MOV DS,AX
    
    LAVEL1:
    MOV AH,9
    LEA DX,a
    INT 21H
    JMP LAVEL2:
    
    LAVEL2:
    MOV AH,9
    LEA DX,b
    INT 21H
    JMP exit 
    
    exit:
    mov ah,4ch
    int 21h
    main endp
end main