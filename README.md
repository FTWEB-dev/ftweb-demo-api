# ftweb-demo-api

Spring Boot 3.x で構築したタスク管理 REST API です。

## 使用技術

- Java 17
- Spring Boot 3.x
- Spring Security + JWT認証
- Spring Data JPA
- MySQL 8.0
- Docker / Docker Compose
- Swagger (springdoc-openapi)
- Gradle
- Lombok

## 機能

- タスクのCRUD操作 (作成・取得・更新・削除)
- JWT認証によるAPIアクセス制御
- Swaggerによるインタラクティブなドキュメント

## 起動手順

### 前提条件
- Docker Desktop がインストールされていること

### 手順

```bash
git clone https://github.com/FTWEB-dev/ftweb-demo-api.git
cd ftweb-demo-api
docker compose up -d
```

ブラウザで以下にアクセス
http://localhost:8080/swagger-ui/index.html

## API一覧

| メソッド | エンドポイント | 説明 | 認証 |
|---|---|---|---|
| POST | /api/auth/login | ログイン・トークン取得 | 不要 |
| GET | /api/tasks | タスク一覧取得 | 必要 |
| GET | /api/tasks/{id} | タスク取得 | 必要 |
| POST | /api/tasks | タスク作成 | 必要 |
| PUT | /api/tasks/{id} | タスク更新 | 必要 |
| DELETE | /api/tasks/{id} | タスク削除 | 必要 |

## 認証方法

1. `POST /api/auth/login` にリクエスト

```json
{
  "username": "ftweb",
  "password": "ftweb"
}
```

2. レスポンスのトークンをSwaggerのAuthorizeに設定
3. 各APIにアクセス可能になる


