package com.example.chattingapp.chatlist

// 3 Fragment 페이지 구현 - ChatFragment
data class ChatRoomItem(
    val chatRoomId: String? = null,
    val otherUserName: String? = null,
    val lastMessage: String? = null,
    val otherUserId: String? = null
)