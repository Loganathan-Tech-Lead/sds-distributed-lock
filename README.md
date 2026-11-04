# 30. Distributed lock

**Category:** Resilience and consistency  |  **Status:** Scaffold - implement the TODOs

Redis SET NX PX with token and ShedLock.

## Sequence
```mermaid
sequenceDiagram
    participant Pod1
    participant Redis
    participant Pod2
    Pod1->>Redis: SET lock NX PX 30000
    Redis->>Pod1: OK
    Pod2->>Redis: SET lock NX PX 30000
    Redis->>Pod2: nil skip
```

## Run
```bash
docker compose up -d
mvn spring-boot:run
```

## Part of
[system-design-concepts-master](../../README.md) - see the master repo for the full concept map.
