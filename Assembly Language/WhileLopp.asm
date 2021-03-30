.model small
.stack 100h 

.code

main proc
    
   
    MOV DX,0
    MOV AH,1
    INT 21H
    
    WHILE_:
    CMP AL,0DH
    JE END_WHILE
    INC DX
    INT 21H
    JMP WHILE_
    
    
    END_WHILE:
    mov ah,4ch
    int 21h
    main endp
end main