.model small
.stack 100h

.code 
main proc
    mov cx,10
    mov ah,2
    mov dl,'*'
    
    L:
    int 21h
    ;LOOP L 
      ;or
    dec cx
    cmp cx,0
    jne L 
    
    exit:
    main endp
end main