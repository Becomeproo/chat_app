package com.example.chattingapp.userlist

// 3 fragment 구현 - userFragment
// 5 RealtimeDB 구축 - 각 속성을 null로 선언한 이유는
// 기본값이 널이면 인수가 없는 기본 생성자가 생성되며, 이는 데이터 스냅샷을 역직렬화하는 데 필요하다.
data class UserItem(
    val userId: String? = null,
    val username: String? = null,
    val description: String? = null,
    val fcmToken: String? = null
)